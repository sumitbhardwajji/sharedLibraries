def getVersion(filename){
    def json = readFile(file: "${filename}")
    print(json)
    def parsedJson = new JsonSlurperClassic().parseText(json)
    def currentVersion = parsedJson['version']
    return currentVersion
}
