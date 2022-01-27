package core

import io.reactivex.rxjava3.subjects.PublishSubject

object EventManager {
    private val topics = HashMap<String, PublishSubject<Any>>()

    fun publish(topic: String, data: Any) {
        if (topics[topic] == null) {
            topics[topic] = PublishSubject.create()
        }
        topics[topic]!!.onNext(data)
    }

    fun subscribe(topic: String): PublishSubject<Any> {
        if (topics[topic] == null) {
            topics[topic] = PublishSubject.create()
        }
        return topics[topic]!!
    }
}