package org.openapitools.server.apis

import io.javalin.http.Context
import io.javalin.http.bodyAsClass
import io.javalin.http.pathParamAsClass
import io.javalin.http.queryParamAsClass

import org.openapitools.server.models.ModelApiResponse
import org.openapitools.server.models.Pet

    interface PetApi {
        fun getDelegate(): PetApiDelegate = object: PetApiDelegate {}
        /**
        * Add a new pet to the store
        * 
        * @param pet Pet object that needs to be added to the store 
        */
        fun addPet(ctx: Context) {
            return getDelegate().addPet(ctx: Context, pet);
        }

        /**
        * Deletes a pet
        * 
        * @param petId Pet id to delete 
        * @param apiKey  (optional)
        */
        fun deletePet(ctx: Context) {
            return getDelegate().deletePet(ctx: Context, petIdapiKey);
        }

        /**
        * Finds Pets by status
        * Multiple status values can be provided with comma separated strings
        * @param status Status values that need to be considered for filter 
        */
        fun findPetsByStatus(ctx: Context) {
            return getDelegate().findPetsByStatus(ctx: Context, status);
        }

        /**
        * Finds Pets by tags
        * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
        * @param tags Tags to filter by 
        */
        fun findPetsByTags(ctx: Context) {
            return getDelegate().findPetsByTags(ctx: Context, tags);
        }

        /**
        * Find pet by ID
        * Returns a single pet
        * @param petId ID of pet to return 
        */
        fun getPetById(ctx: Context) {
            return getDelegate().getPetById(ctx: Context, petId);
        }

        /**
        * Update an existing pet
        * 
        * @param pet Pet object that needs to be added to the store 
        */
        fun updatePet(ctx: Context) {
            return getDelegate().updatePet(ctx: Context, pet);
        }

        /**
        * Updates a pet in the store with form data
        * 
        * @param petId ID of pet that needs to be updated 
        * @param name Updated name of the pet (optional)
        * @param status Updated status of the pet (optional)
        */
        fun updatePetWithForm(ctx: Context) {
            return getDelegate().updatePetWithForm(ctx: Context, petIdnamestatus);
        }

        /**
        * uploads an image
        * 
        * @param petId ID of pet to update 
        * @param additionalMetadata Additional data to pass to server (optional)
        * @param file file to upload (optional)
        */
        fun uploadFile(ctx: Context) {
            return getDelegate().uploadFile(ctx: Context, petIdadditionalMetadatafile);
        }

    }
