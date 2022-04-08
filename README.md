# InversionDeCtrl
<h3> -- Le premier TP d'inversion de contrôle</h3>
<p>Avant tout, Il est indispensable de présenter l'objectif de ce TP, alors à la suite du cours de la programmation distribué, dans ce tp on va aborder la notion 
 de<strong><i> l'inversion de contrôle</i></strong>, notamment on va voir comment vous pouvez créer ou bien développer une application qui est fermé à la modification
 mais ouverte à l'extension autrement dit, cette technique consiste à développer par exemple une application qui peut être étendue au future c'est à dire avoir d'autres
 versions, mais tout ça sans modifier ou même toucher le code source. ça ce qui on appelle l'inversion de contrôle</p>
 
 <p><strong><b>Alors pour ce TP</b></strong>, nous avons essayé montrer dans une petit application l'ensemble des étapes que vous devez suivre pour que vous auriez par la suite capable
 de développer votre propre application ou votre projet. Vous devez savoir aussi que cette technique n'utilise aucun framework. mais on a la possibilité de l'utiliser
 parceque en fait ça va vous aidez beaucoup. </p>
 
 <p><strong><b>L'application</b></strong> développé est structuré en trois couches principales:
 <ol>
  <li>Couche DAO</li>
  <li>Couche Metier</li>
  <li>Couche Web ou Présentation</li>
 </ol>
 Bien sûr chaque couche a un rôle et un fonctionnement, c'est à dire chaque couche traiter et manipuler un ensemble de besoins. Ces besoins sont bien défini.
 </p>

<h4>1/ Couche DAO : C'est dont laquel on exprime et on traite les besoins techniques </h4>
<span> - Voici quelques captures d'écrans de cette couche, comme vous voyez, nous avons créé une interface, cette dernière est implémenté par une classe,
celle-ci, on va soit se connecter au BD ou une autre ressource de données. le plus important à ce propos c'es tque à chaque fois on veut faire améliorer 
l'application, il suffit de créer une nouvelle classe qui implémente l'interface que nous avons créé au début.</span> 
<hr>
 
<i>1.1/ Interface <b>IntDao</b> :</i>
<br/>
<br/>
![interface](https://user-images.githubusercontent.com/102219821/162355366-a76db86f-0962-41f1-bfa5-bedadb1741b6.png)
<br/>
<br/>
<i>1.2/ Classe <b>DaoImpl</b> :</i>
<br/>
<br/> 
![classdao](https://user-images.githubusercontent.com/102219821/162355507-52e6f017-7740-4421-9d44-c42f053b6898.png)
<br/>
<br/> 
<h4>2/ Couche Metier : C'est dont laquel on exprime et on traite les besoins fonctionnelles </h4>
<span> - Voici quelques captures d'écrans de cette couche, comme vous voyez,de même façon, nous avons créé une interface, cette dernière est implémenté par une classe,
dont lequel on va toute le traitement et les calcules, etc.. </span> 
<hr>

<i>2.1/ Interface <b>IntMetier</b> :</i>
<br/>
<br/> 
![intmetier](https://user-images.githubusercontent.com/102219821/162356471-aa8e0bd4-5102-4ed3-94fb-b3d8030db10f.png)
<br/>
<br/> 
<i>2.2/ Classe <b>MetierImpl</b> :</i>
<br/>
<br/> 
![classe](https://user-images.githubusercontent.com/102219821/162356547-4e0345cb-268e-436d-baec-e5111c50f7f7.png)
<br/>
<br/> 
<h4>3/ Couche Présentation : C'est dont laquel on instancie et on invoque les méthodes </h4>
<span> - Voici quelques captures d'écrans de cette couche, comme vous voyez, nous avons créé une classe, dont lequel on doit instancier les objets et invoquer
les méthodes que on veut utiliser, autrement dit c'est celui-ci on doit satisfait les dépendances entre une interface et une implémentation de cette interface,
mais à ce niveau là, il fallait de dire qu'il existe 2 façon pour le faire, il y'a ce que on appelle l'instanciation statique mais cette dernière impose trés 
souvent des problèmes au niveau de la maintenance, et l'autre façon s'appelle l-instanciation dynamique.</span> 
<hr>

<i>3.1/ Classe <b>Presentation2</b> :</i>
<br/>
<br/> 
![class](https://user-images.githubusercontent.com/102219821/162357800-fafef0d6-cefe-4ce2-9833-873ff719db86.png)
<br/>
<br/> 
<br/>
<h3>Conclusion</h3>
<p>D'après tout cela, j'ai conclu que, le principe de couplage faible (les composants sont faiblement associés les uns aux autres  et ainsi, les changements 
dans un composant affectent le moins l'existence ou les performances d'un autre composant.) est très important dans  la programmation modèrnes, vous facilte 
beaucoup la phase de développement,  </p>  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
