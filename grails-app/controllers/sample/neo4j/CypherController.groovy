package sample.neo4j

class CypherController {

    def index() {
        forward action:"cypher"

    }

    def cypher() {
        response.contentType = "text/plain"
        render Speaker.cypherStatic("start n=node({this}) match n-[:INSTANCE]->m return m")
    }


}
