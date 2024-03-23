package id.ac.pnm.ti.utsmobilesatu
data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,  // FA Cup trophy
    val efl: Int,  // EFL Cup trophy
    val ligaChampions: Int,  // Champions League trophy
    val ligaEuropa: Int   // Europa League trophy
)
{
    val totalTrophy: Int
        get() = epl + fa + efl + ligaChampions + ligaEuropa

    fun recap(): String {
        return "|  ${name.padEnd(21)}| ${epl.toString().padEnd(19)}| ${fa.toString().padEnd(4)}| " + "${efl.toString().padEnd(4)}| " +
                "${ligaChampions.toString().padEnd(21)}| " + "${ligaEuropa.toString().padEnd(16)}|" + "${totalTrophy.toString().padEnd(15)}|"
    }
}
