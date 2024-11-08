package org.openapitools.server

import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.delete
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.path
import io.javalin.apibuilder.ApiBuilder.post
import io.javalin.apibuilder.ApiBuilder.put
import org.openapitools.api.PetApiDelegate
import org.openapitools.api.StoreApiDelegate
import org.openapitools.api.UserApiDelegate
import org.openapitools.server.apis.PetApiController
import org.openapitools.server.apis.StoreApiController
import org.openapitools.server.apis.UserApiController

fun main() {
    val petApi = PetApiController(object : PetApiDelegate {})
    val storeApi = StoreApiController(object : StoreApiDelegate {})
    val userApi = UserApiController(object : UserApiDelegate{})

    val app = Javalin
        .create { config ->
            config.router.apiBuilder {
                path("/pet") { post(petApi::addPet) }
                path("/pet/{petId}") { delete(petApi::deletePet) }
                path("/pet/findByStatus") { get(petApi::findPetsByStatus) }
                path("/pet/findByTags") { get(petApi::findPetsByTags) }
                path("/pet/{petId}") { get(petApi::getPetById) }
                path("/pet") { put(petApi::updatePet) }
                path("/pet/{petId}") { post(petApi::updatePetWithForm) }
                path("/pet/{petId}/uploadImage") { post(petApi::uploadFile) }

                path("/store/order/{orderId}") { delete(storeApi::deleteOrder) }
                path("/store/inventory") { get(storeApi::getInventory) }
                path("/store/order/{orderId}") { get(storeApi::getOrderById) }
                path("/store/order") { post(storeApi::placeOrder) }

                path("/user") { post(userApi::createUser) }
                path("/user/createWithArray") { post(userApi::createUsersWithArrayInput) }
                path("/user/createWithList") { post(userApi::createUsersWithListInput) }
                path("/user/{username}") { delete(userApi::deleteUser) }
                path("/user/{username}") { get(userApi::getUserByName) }
                path("/user/login") { get(userApi::loginUser) }
                path("/user/logout") { get(userApi::logoutUser) }
                path("/user/{username}") { put(userApi::updateUser) }

            }
        }

    app.start()
}
