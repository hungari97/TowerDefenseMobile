package com.example.openglpractice.model

import com.example.openglpractice.model.character.CharacterData
import com.example.openglpractice.model.feature.AFeatureData

data class LevelData(
    val fieldLayer:Array<FieldData>,
    val AFeatureLayer: Array<AFeatureData<*>?>,
    val characterLayer: Array<CharacterData<*>?>,
    val waveNumber:Int,
    val columnNumber:Int,
    var coin:Int,
    var buildLimit:Int
) {
}