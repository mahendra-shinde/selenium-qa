#include <Constants.au3>
Local $iAnswer = MsgBox(BitOR($MB_YESNO, $MB_SYSTEMMODAL), "AutoIt Example", "This script will run Notepad, type in some text and then quit.  Do you want to run it?")

; MsgBox(0,"Your Response","Your response was " & $iAnswer)
If $iAnswer = $IDYES Then
  MsgBox(0, "Your Response", "You chose YES!")
  Run("notepad.exe")
ElseIf $iAnswer = $IDNO Then
  MsgBox(0, "Your Response", "You chose NO!")
  Run("calc.exe")
EndIf
