package io.ere.icacoe.kotlin.store

import io.ere.icacoe.kotlin.store.board.BoardState
import io.ere.icacoe.kotlin.store.board.boardReducer
import io.ere.icacoe.kotlin.store.game.GameState
import io.ere.icacoe.kotlin.store.game.gameReducer
import org.rekotlin.Action

fun appReducer(action: Action, oldState: AppState?) : AppState {

  // if no state has been provided, create the default state
  val state = oldState ?: AppState( 
    gameState = GameState(),
    boardState = BoardState()
  )

  return state.copy(
    gameState = (::gameReducer)(action, state.gameState),
    boardState = (::boardReducer)(action, state.boardState)
  )
}