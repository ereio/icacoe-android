package io.ere.icacoe.kotlin.views.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.navigation.fragment.findNavController
import io.ere.icacoe.kotlin.R
import io.ere.icacoe.kotlin.store.game.SetCurrentPlayer
import io.ere.icacoe.kotlin.store.store

/**
 *
 * Home Fragment
 *
 * An example Fragment using more traditional methods to reference UI resources
 */
class HomeFragment : Fragment() {

    private val playerToggleX: CheckBox by lazy {
        view?.findViewById(R.id.checkBoxX) as CheckBox
    }

    private val playerToggleO: CheckBox by lazy {
       view?.findViewById(R.id.checkBoxO) as CheckBox
    }

    private val continueButton: Button by lazy {
        view?.findViewById(R.id.button_continue) as Button
    }
    
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

//        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//            .setAction("Action", null).show()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        playerToggleX.setOnClickListener { view ->
            store.dispatch(SetCurrentPlayer(currentPlayer = "X"))
            if(playerToggleO.isChecked){
                playerToggleO.toggle()
            }
        }

        playerToggleO.setOnClickListener { view ->
            store.dispatch(SetCurrentPlayer(currentPlayer = "O"))
            if(playerToggleX.isChecked){
                playerToggleX.toggle()
            }
        }

        continueButton.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

    }
}