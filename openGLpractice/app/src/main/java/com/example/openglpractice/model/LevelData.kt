package com.example.openglpractice.model

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