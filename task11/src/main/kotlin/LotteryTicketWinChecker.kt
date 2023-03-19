class LotteryTicketWinChecker {

    companion object {
        private const val WINNER_RESPONSE = "Winner!"
        private const val LOSER_RESPONSE = "Loser!"
    }

    fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
        var winPairs = 0

        ticket.forEach {
            if (isPairHaveWinCombination(it)) winPairs++
        }

        return if (isWinTicket(winPairs, win)) WINNER_RESPONSE else LOSER_RESPONSE
    }

    private fun isPairHaveWinCombination(pair: Pair<String, Int>): Boolean {
        val charsCode = pair.first.codePoints().filter { it == pair.second }.count()

        return charsCode > 0
    }

    private fun isWinTicket(numberOfWinPairs: Int, winNumbers: Int): Boolean {
        return numberOfWinPairs >= winNumbers
    }
}