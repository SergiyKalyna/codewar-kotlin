class AtomsCounter {

    companion object {
        private val REGEX = Regex("(?:([A-Z][a-z]*)|([\\[\\(\\{])|([\\]\\)\\}]))(\\d+)?")
    }

    fun getAtoms(formula: String): Map<String, Int> {
        val moleculeBuilder = MoleculeBuilder()

        REGEX.findAll(formula).forEach {
            val atomGroup = it.groups[1]?.value
            val openGroup = it.groups[2]?.value
            val closeGroup = it.groups[3]?.value
            val countGroup = it.groups[4]?.value

            atomGroup?.let { moleculeBuilder.addAtom(atomGroup, countGroup?.toInt() ?: 1) }
            openGroup?.let { moleculeBuilder.openMolecule(openGroup) }
            closeGroup?.let { moleculeBuilder.closeMolecule(closeGroup, countGroup?.toInt()) }
        }
        val result = moleculeBuilder.build().calculateAtoms()

        if (result.isEmpty()) throw IllegalArgumentException()

        return result.also { println("formula $formula -> $it") }
    }
}