class RainVolumeProvider {

    fun getRainVolume(towerHeights: IntArray): Int {
        var left = 0
        var right = towerHeights.size - 1
        var maxWater = 0
        var leftMax = 0
        var rightMax = 0

        while (left < right) {
            if (towerHeights[left] > leftMax) {
                leftMax = towerHeights[left]
            }
            if (towerHeights[right] > rightMax) {
                rightMax = towerHeights[right]
            }
            if (leftMax < rightMax) {
                maxWater += leftMax - towerHeights[left]
                left++
            } else {
                maxWater += rightMax - towerHeights[right]
                right--
            }
        }

        return maxWater
    }
}