package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;


import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;


public interface PetApi extends ApiClient.Api {


  /**
   * Add a new pet to the store
   * 

    * @param pet Pet object that needs to be added to the store (required)



   */
  @RequestLine("POST /pet")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",
  })
  void addPet(Pet pet);
    
  
  /**
   * Deletes a pet
   * 

    * @param petId Pet id to delete (required)

    * @param apiKey  (optional)



   */
  @RequestLine("DELETE /pet/{petId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",
    "api_key: {apiKey}"
  })
  void deletePet(@Param("petId") Integer petId, @Param("apiKey") String apiKey);
    
  
  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings

    * @param status Status values that need to be considered for filter (required)


   * @return List&lt;Pet&gt;


   */
  @RequestLine("GET /pet/findByStatus?status={status}")
  @Headers({
    "Content-Type: ",
    "Accept: application/json",
  })
  List<Pet> findPetsByStatus(@Param("status") List<String> status);
    

  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   * Note, this is equivalent to the other <code>findPetsByStatus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindPetsByStatusQueryParams} class that allows for
   * building up this map in a fluent style.
      
        
      
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
      
   *   <li>status - Status values that need to be considered for filter (required)</li>
      
   *   </ul>
      
   * @return List&lt;Pet&gt;
      
      
   */
  @RequestLine("GET /pet/findByStatus?status={status}")
  @Headers({
  "Content-Type: ",
  "Accept: application/json",
  })
  List<Pet> findPetsByStatus(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>findPetsByStatus</code> method in a fluent style.
   */
  public static class FindPetsByStatusQueryParams extends HashMap<String, Object> {
      
    public FindPetsByStatusQueryParams status(final List<String> value) {
        
        
      put("status", EncodingUtils.encode(value));
        
      return this;
    }
      
  }
    
  
  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

    * @param tags Tags to filter by (required)


   * @return List&lt;Pet&gt;


   */
  @RequestLine("GET /pet/findByTags?tags={tags}")
  @Headers({
    "Content-Type: ",
    "Accept: application/json",
  })
  List<Pet> findPetsByTags(@Param("tags") List<String> tags);
    

  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   * Note, this is equivalent to the other <code>findPetsByTags</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FindPetsByTagsQueryParams} class that allows for
   * building up this map in a fluent style.
      
        
      
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
      
   *   <li>tags - Tags to filter by (required)</li>
      
   *   </ul>
      
   * @return List&lt;Pet&gt;
      
      
   */
  @RequestLine("GET /pet/findByTags?tags={tags}")
  @Headers({
  "Content-Type: ",
  "Accept: application/json",
  })
  List<Pet> findPetsByTags(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>findPetsByTags</code> method in a fluent style.
   */
  public static class FindPetsByTagsQueryParams extends HashMap<String, Object> {
      
    public FindPetsByTagsQueryParams tags(final List<String> value) {
        
        
      put("tags", EncodingUtils.encode(value));
        
      return this;
    }
      
  }
    
  
  /**
   * Find pet by ID
   * Returns a single pet

    * @param petId ID of pet to return (required)


   * @return Pet


   */
  @RequestLine("GET /pet/{petId}")
  @Headers({
    "Content-Type: ",
    "Accept: application/json",
  })
  Pet getPetById(@Param("petId") Integer petId);
    
  
  /**
   * Update an existing pet
   * 

    * @param pet Pet object that needs to be added to the store (required)



   */
  @RequestLine("PUT /pet")
  @Headers({
    "Content-Type: application/json",
    "Accept: ",
  })
  void updatePet(Pet pet);
    
  
  /**
   * Updates a pet in the store with form data
   * 

    * @param petId ID of pet that needs to be updated (required)

    * @param body  (optional)



   */
  @RequestLine("POST /pet/{petId}")
  @Headers({
    "Content-Type: application/x-www-form-urlencoded",
    "Accept: ",
  })
  void updatePetWithForm(@Param("petId") Integer petId, Object body);
    
  
  /**
   * uploads an image
   * 

    * @param petId ID of pet to update (required)

    * @param body  (optional)


   * @return ModelApiResponse


   */
  @RequestLine("POST /pet/{petId}/uploadImage")
  @Headers({
    "Content-Type: multipart/form-data",
    "Accept: application/json",
  })
  ModelApiResponse uploadFile(@Param("petId") Integer petId, Object body);
    
  

}
