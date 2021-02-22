# spring-mongo

    Entidades User e Post

    User contem referencias de posts
    Post contem um AuthorDTO que tem alguns dados necessarios de um User e uma lista de comments
    Comment tambem contem um AuthorDTO

    Comment esta definido somente como DTO pois não é uma coleção no banco, diferente de User e Post

 - GET localhost:8080/users (Obter todos os objetos users)
 - GET localhost:8080/users/{id} (Obter um objeto user por id)
 - GET localhost:8080/users/{id}/posts (Obter todos os objetos post do user)
 - POST	localhost:8080/users (Criar objeto user) -> necessario passar um corpo
 - PUT localhost:8080/users/{id} (Atualizar um objeto user) -> necessario passar um corpo
 - DELETE localhost:8080/users/{id} (Remover um objeto user)

 - GET localhost:8080/posts/{id} (Obter um objeto post por id)
