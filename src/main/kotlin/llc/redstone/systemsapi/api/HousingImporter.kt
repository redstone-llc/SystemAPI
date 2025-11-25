package llc.redstone.systemsapi.api

interface HousingImporter {
    fun getFunctionOrNull(name: String): Function?
    fun getAllFunctions(): List<Function>
    fun getCommandOrNull(name: String): Command?
}