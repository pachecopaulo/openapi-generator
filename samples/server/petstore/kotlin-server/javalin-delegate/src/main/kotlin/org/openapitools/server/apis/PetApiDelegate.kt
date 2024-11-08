package org.openapitools.api

import io.javalin.http.Context
import io.javalin.http.HttpStatus
import org.openapitools.server.models.Pet

/**
 * A delegate to be called by the {@link PetApiController}}.
 */
interface PetApiDelegate {

    /**
     * @see PetApi#addPet
     */
    fun addPet(ctx: Context, pet: Pet) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see PetApi#deletePet
     */
    fun deletePet(ctx: Context, petId: kotlin.Long, apiKey: kotlin.String?) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see PetApi#findPetsByStatus
     */
    fun findPetsByStatus(ctx: Context, status: kotlin.collections.List<kotlin.String>) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see PetApi#findPetsByTags
     */
    fun findPetsByTags(ctx: Context, tags: kotlin.collections.List<kotlin.String>) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see PetApi#getPetById
     */
    fun getPetById(ctx: Context, petId: kotlin.Long) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see PetApi#updatePet
     */
    fun updatePet(ctx: Context, pet: Pet) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see PetApi#updatePetWithForm
     */
    fun updatePetWithForm(ctx: Context, petId: kotlin.Long, name: kotlin.String?, status: kotlin.String?) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }


    /**
     * @see PetApi#uploadFile
     */
    fun uploadFile(ctx: Context, petId: kotlin.Long, additionalMetadata: kotlin.String?, file: io.javalin.http.UploadedFile?) {
        ctx.status(HttpStatus.NOT_IMPLEMENTED)
    }

}
