class Solution {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val rainVolumeProvider = RainVolumeProvider()

            println(rainVolumeProvider.getRainVolume(intArrayOf(5,2,10)))
            println(rainVolumeProvider.getRainVolume(intArrayOf(1,0,5,2,6,3,10)))
            println(rainVolumeProvider.getRainVolume(intArrayOf()))
        }
    }
}