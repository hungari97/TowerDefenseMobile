package com.example.openglpractice.model

import com.example.openglpractice.model.feature.AFeatureData
import com.example.openglpractice.utility.Vector

data class LevelData(
    var fieldLayer:Array<FieldData>,
    var featureLayer: Array<AFeatureData<*>?>,
    var enemyToSpawnCount: Array<Int>,
    var trapLimits: Array<Int>,
    var crystalPosition: Vector<Int>
) {
}