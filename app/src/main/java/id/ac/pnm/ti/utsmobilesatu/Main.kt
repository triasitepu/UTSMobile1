package id.ac.pnm.ti.utsmobilesatu

fun main() {
    // Create a list of Club objects
    val clubs = listOf(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 5, 3, 1),
        Club("Chelsea", 6, 8, 5, 2, 2),
        Club("Manchester City", 8, 8, 8, 0, 0),
        Club("Arsenal", 13, 14, 2, 0, 0),
    )

    println("=".repeat(115)) // garis pemisah

    // Sort clubs by total trophies (descending)
    val sortedClubs = clubs.sortedByDescending { it.totalTrophy }

    // Print sorted clubs with name and total trophies
    println("Urutan klub berdasarkan jumlah total trofi: ")
    for (club in sortedClubs) {
        println("${club.name}: ${club.totalTrophy}")
    }

    println("=".repeat(115)) // garis pemisah

    // Filter clubs without UCL and UEL wins
    val filteredClubs = clubs.filter { it.ligaChampions == 0 && it.ligaEuropa == 0 }

    // Print filtered clubs (names only)
    println("Klub yang belum pernah memenangkan UCL dan UEL:")
    for (club in filteredClubs) {
        println(club.name)
    }

    println("=".repeat(115)) // garis pemisah

    // Menampilkan rekap perolehan trofi klub
    println("Rekap Perolehan Trofi Klub:")
    val headerLength = listOf( "Nama", "Liga Primer Inggris ", "FA", "EFL", "Liga Champions Eropa", "Liga Eropa UEFA ", "Total Trofi").map { it.length + 3 }.maxOrNull() ?: 20
    println(" |${"-".repeat(headerLength)}|${"-".repeat(20)}|${"-".repeat(5)}|${"-".repeat(5)}|${"-".repeat(22)}|${"-".repeat(17)}|${"-".repeat(15)}|")
    println(" |         Nama          | Liga Primer Inggris| FA  | EFL | Liga Champions Eropa | Liga Eropa UEFA |  Total Trofi  |")
    println(" |${"-".repeat(headerLength)}|${"-".repeat(20)}|${"-".repeat(5)}|${"-".repeat(5)}|${"-".repeat(22)}|${"-".repeat(17)}|${"-".repeat(15)}|")
    clubs.forEachIndexed { index, club ->
        println(" ${club.recap()}")
        }
    }
