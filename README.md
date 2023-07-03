# Clojure code examples

Here are some sample codes I created in the phase of learning clojure.

you can find some useful links:

[Clojure Official Website](https://clojure.org/).

[Clojure Guides](https://clojure.org/guides/getting_started).

[Clojure reference](https://clojure.org/reference).

[Clojure Docs](https://clojure.github.io/clojure/).

[Clojure JavaDocs](https://clojure.github.io/clojure/javadoc/).

[Clojure Core Docs : search for keywords](https://clojuredocs.org/clojure.core).

[Clojure API cheatsheet](https://clojure.org/api/cheatsheet).

[Clojure Features](https://clojure.org/about/dynamic).

[Clojure Github](https://github.com/clojure).

[Community Resources](https://clojure.org/community/resources#_tutorials_and_learning_materials).

[Community: Ask Clojure](https://ask.clojure.org/).

[Community: Clojure Verse](https://clojureverse.org/).

[Learning: 4ever-clojure](https://4clojure.oxal.org/).

[Learning: Exercism](https://exercism.org/tracks/clojure).

[Learning: Maria cloud](https://www.maria.cloud/).

[Learning: Quil](http://quil.info/).


## Requirements

To run this code you need [Leiningen](https://leiningen.org).

These tutorials will work on JDK 6 through 8 (Oracle or OpenJDK).


Here also you can find Clojure code examples from
[RabbitMQ tutorials](https://www.rabbitmq.com/getstarted.html).

## Code

Code examples are executed via `lein run`:

Tutorial one: "Hello World!"

    lein run -m rabbitmq.tutorials.send
    lein run -m rabbitmq.tutorials.receive

Tutorial two: Work Queues

    lein run -m rabbitmq.tutorials.new-task
    lein run -m rabbitmq.tutorials.worker

Tutorial three: Publish/Subscribe

    lein run -m rabbitmq.tutorials.receive-logs
    lein run -m rabbitmq.tutorials.emit-log

Tutorial four: Routing

    lein run -m rabbitmq.tutorials.receive-logs-direct
    lein run -m rabbitmq.tutorials.emit-log-direct info

Tutorial five: Topics

    lein run -m rabbitmq.tutorials.receive-logs-topic
    lein run -m rabbitmq.tutorials.emit-log-topic info

Tutorial six: RPC

    lein run -m rabbitmq.tutorials.rpc-server
    lein run -m rabbitmq.tutorials.rpc-client

To learn more, visit [Langohr documentation](http://clojurerabbitmq.info) site.
