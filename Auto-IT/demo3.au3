; AutoIt script to open Firefox and go to wikipedia.org

Local $sURL = "https://practice.expandtesting.com/upload"
Local $sFirefoxPath = "C:\Program Files\Mozilla Firefox\firefox.exe"

; Check if Firefox exists
If FileExists($sFirefoxPath) Then
    Run('"' & $sFirefoxPath & '"  ' & $sURL)
Else
    MsgBox(16, "Error", "Firefox not found at: " & $sFirefoxPath)
EndIf
