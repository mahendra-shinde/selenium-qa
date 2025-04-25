Run ("notepad.exe")
WinWaitActive("[CLASS:Notepad]")
send("The quick brown fox jumps over the lazy dog.{ENTER}"); 
send("                    jumps over the lazy dog.{ENTER}");
send("                               the lazy dog.{ENTER}");
