package components

import core.EventManager
import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

class PublishComponent(name: String, interval: Long, subscribeTopic: String, sendTopic: String) {
    init {
        EventManager.subscribe(subscribeTopic).subscribe {
            println("$name received $it")
        }
        Observable.interval(interval, TimeUnit.MILLISECONDS).subscribe {
            EventManager.publish(sendTopic, "DATA FROM $name #$it")
        }
    }
}