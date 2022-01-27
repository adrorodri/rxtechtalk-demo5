import components.PublishComponent

fun main(args: Array<String>) {
    println("Hello Mojix")
    PublishComponent("Component 1", 400,"tech-talk-rx-111", "tech-talk-rx-444")
    PublishComponent("Component 2", 500,"tech-talk-rx-222", "tech-talk-rx-333")
    PublishComponent("Component 3", 600,"tech-talk-rx-333", "tech-talk-rx-222")
    PublishComponent("Component 4", 700,"tech-talk-rx-444", "tech-talk-rx-111")

    while(true) {
    }
}