# Miniprojet-AL

Ce projet est composé par différents couches distribués dans 3 packages et un package plus grand (File) contenant les packages, les interfaces et les classes d'implémentation.
On utilise une LinkedList comme attribut de la FileMutable, la file est du type generique T et la LinkedList du type générique R.
Les packages ont la distribution suivante :
1. etats : Contenant un état et un cas pour chaque type de liste.
2. fabriques : Contenant les interfaces fabriques qui appellent les constructeurs des classes d'implémentation.
3. servies : Contenant les interfaces de services, c'est à dire les fonctionnalités associées à chaque type de liste.

Pour l'instant les fonctionnalités sont :
1.	creerFile(LinkeList) : Crée une file depuis une LinkedList, comme on obtient la LinkedList en paramètre la complexité est O(1).
2.	creerFile(element) : Crée une file depuis un élément de type générique, comme on obtient l’element en paramètre la complexité est O(1).
3.	push(element) : Ajoute un élément à la fin de la file, comme on obtient l’élément en paramètre et il faut pas parcourir la liste, la complexité est O(1).
4.	pull() : Enlève le premier élément de la file, comme il faut pas parcourir la liste, la complexité est O(1).
