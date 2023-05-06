class MoleculeBuilder {

    companion object{
        private val GROUP_PAIRS = listOf(
            "[" to "]",
            "(" to ")",
            "{" to "}",
        )

        private val MOLECULE_QUEUE = mutableListOf(Molecule())
        private val GROUPS_QUEUE = mutableListOf<String>()
    }

    private val currentMolecule: Molecule
        get() = MOLECULE_QUEUE.last()

    private val currentGroup: String
        get() = GROUPS_QUEUE.lastOrNull() ?: throw IllegalArgumentException()

    fun addAtom(name: String, count: Int) {
        currentMolecule.atoms.add(Atom(name, count))
    }

    fun openMolecule(group: String) {
        val newMolecule = Molecule()
        GROUPS_QUEUE.add(group)
        MOLECULE_QUEUE.add(newMolecule)
    }

    fun closeMolecule(group: String, count: Int?) {
        val groupPair = GROUP_PAIRS.first { it.first == currentGroup }
        if (groupPair.second != group) throw IllegalArgumentException()

        val molecule = currentMolecule
        GROUPS_QUEUE.removeLast()
        MOLECULE_QUEUE.removeLast()
        currentMolecule.molecules.add(molecule to (count ?: 1))
    }

    fun build(): Molecule {
        require(MOLECULE_QUEUE.size == 1)
        require(GROUPS_QUEUE.isEmpty())

        return currentMolecule
    }
}