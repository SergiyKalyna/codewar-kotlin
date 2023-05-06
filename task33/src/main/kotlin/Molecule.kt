data class Molecule(
    var atoms: MutableList<Atom> = mutableListOf(),
    var molecules: MutableList<Pair<Molecule, Int>> = mutableListOf()
){

    fun calculateAtoms(): Map<String, Int> {
        val moleculeMap = mutableMapOf<String, Int>()
        atoms.forEach {
            moleculeMap[it.name] = (moleculeMap[it.name] ?: 0) + it.count
        }

        molecules.forEach { nested ->
            val result = nested.first.calculateAtoms().mapValues {
                it.value * nested.second
            }
            result.forEach { (name, count) ->
                moleculeMap[name] = (moleculeMap[name] ?: 0) + count
            }
        }

        return moleculeMap
    }
}
