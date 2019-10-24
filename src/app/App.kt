package app

import kotlinx.html.id
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.code
import react.dom.div
import react.dom.h2
import react.dom.p

class App : RComponent<RProps, RState>() {
    
    override fun RBuilder.render() {
        div{
            attrs.id = "app-header"
            h2 {
                +"alr"
            }
        }
        p {
            +"Welcome"
        }
    }
}

fun RBuilder.app() = child(App::class) {}