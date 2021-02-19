package io.ere.icacoe.kotlin.store.game

import io.ere.icacoe.kotlin.store.AppState
import org.rekotlin.DispatchFunction
import org.rekotlin.Middleware


fun checkWinner(action: CheckWinner, dispatch: DispatchFunction, getState: () -> AppState?) {
    var positions = getState()?.boardState?.positions;

    if(true){
        dispatch(SetWinner(winner = "X"))
    }
}

internal val gameMiddleware: Middleware<AppState> = { dispatch, getState ->
    { next ->
        { action ->
            when (action) {
                is CheckWinner -> {
                    checkWinner(action, dispatch, getState)
                }
            }

            next(action)

        }
    }
}