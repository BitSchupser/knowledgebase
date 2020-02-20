// Path where the docToolchain will produce the output files.
// This path is appended to the docDir property specified in gradle.properties
// or in the command line, and therefore must be relative to it.
outputPath = 'build'

inputPath = 'doc'

// For every document to create add an entry into this array
// example:
// 
// inputFiles = [
//        [file: 'arc42-template.adoc', formats: ['html','pdf']]
//              ]

inputFiles = [[file: 'knowledgebase.adoc', formats: ['html','pdf']]]

taskInputsDirs = ["${inputPath}/src",
                  "${inputPath}/images",
                 ]

// Add an entry for every document you want to create here
// example:
// taskInputsFiles = ["${inputPath}/arc42-template.adoc"]
taskInputsFiles = ["${inputPath}/knowledgebase.adoc"]
