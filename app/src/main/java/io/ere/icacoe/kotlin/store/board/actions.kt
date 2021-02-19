package io.ere.icacoe.kotlin.store.board

import org.rekotlin.Action

data class AddPlayerMove(val player: String, val position: String) : Action

class ResetBoard : Action

