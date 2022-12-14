import groovy.json.JsonSlurperClassic
import groovy.json.JsonOutput

def getVersion(filename){
    def json = readFile(file: "${filename}")
    print(json)
    def parsedJson = new JsonSlurperClassic().parseText(json)
    def currentVersion = parsedJson['version']
    return currentVersion
}
