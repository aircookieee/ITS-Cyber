# Chieda all'utente di inserire la velocità media dell'automobile in km/h.
avgSpeed = input("Inserisci la tua velocità media: ")

# Chieda all'utente di inserire il tempo di viaggio in ore.
hoursTaken = input("Inserisci le ore che hai impiegato: ")

# Converta i due valori inseriti in numeri decimali utilizzando float().
avgSpeed = float(avgSpeed)
hoursTaken = float(hoursTaken)

# Calcoli la distanza percorsa moltiplicando la velocità media per il tempo.
distance = avgSpeed*hoursTaken

# Crei una variabile chiamata Messaggio contenente il testo "Distanza percorsa: " seguito dal risultato del calcolo.
messaggio = "Distanza percorsa: " + str(distance)

# Visualizzi il messaggio utilizzando print().
print(messaggio)