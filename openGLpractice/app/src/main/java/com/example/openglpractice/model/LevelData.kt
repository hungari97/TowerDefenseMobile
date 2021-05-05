package com.example.openglpractice.model

import com.example.openglpractice.model.character.CharacterData
import com.example.openglpractice.model.feature.AFeatureData
import com.example.openglpractice.utility.Vector

data class LevelData(
    var fieldLayer:Array<FieldData>,
    var featureLayer: Array<AFeatureData<*>?>,
    var characterLayer: Array<CharacterData<*>?>,
    var enemyToSpawnCount: Array<Int>,
    var trapLimits: Array<Int>,
    val columnNumber:Int,
    var coin:Int,
    var buildLimit:Int,
    var crystalPosition: Vector<Int>,
) {
}