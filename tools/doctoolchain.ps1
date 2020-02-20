$mainConfigFile = 'doc/Config.groovy'
$parentDirectory = (Get-Item (Get-Location)).Parent.FullName
$configFilePath = Join-Path -Path $parentDirectory -ChildPath $mainConfigFile

if (!(Test-Path($configFilePath))) {
    Write-Error -Message "Configfile '${configFilePath}' does not exist, please init the directory first (e.g. by calling initXITASO.ps1)"
    exit
}

docker run --rm --entrypoint /bin/bash -it -v ${parentDirectory}:/project rdmueller/doctoolchain:rc-1.2.0 `
     -c "doctoolchain . ${args} -PinputPath=src/main/asciidoc -PpdfThemeDir=pdfTheme -PmainConfigFile=${mainConfigFile} && exit"