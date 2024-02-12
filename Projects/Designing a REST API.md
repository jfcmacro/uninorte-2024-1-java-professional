## Designing a REST API

The purpose of this exercise is to learn how to design a RESTful API.

It will take you about **5 hours** to complete the task; so, occasionally, take a break to clear your head.

Please be aware that the task status is **mandatory**.

*Description* 

1. Please choose a topic for this exercise from the following:
   - Catalogue (for example, a campus – rooms, occupation; a library – books, authors, categories; etc.) 
   - Logging (for example, ship logs – entries, events, dates; server logs – events, severity, instances; etc.) 
   - Scheduling/Alerting Systems (for example, scheduling and alerting of the deadlines of education activities, scheduling and alerting of zoo animals' nutrition)
2. Describe what entities it must use.
3. Describe what operations with these functions the API must support.
4. Design a REST API including collections, filters, pagination, etc. 
5. Send the following results: 
   - The description of entities and operations.
   - The REST API description. 

**How to self-evaluate this task:**

Please be aware that we expect the completed task to meet the following criteria:

- Both functional and non-functional requirements should be provided.
- The model should be complete and unambiguous.
- All operation descriptions should be complete.
- All the status codes should be meaningful and mapped to their description.
- The Richardson Maturity Model should be applied.
- Errors and the authentication method should be described.
- All relevant methods should be paginated.
- Caching should be described, and all required methods should be cached.

**The max score for this task is 50 points. To pass the task, you need to get 70% of the points.**

| Criteria/Points                                | 0 point                                                      | 2 points                                                     | 4 points                                                     | 7 points                                                     |
| ---------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Functional and non-functional requirements** | The requirements are not provided.                           | Either functional or non-functional requirements are not provided. | Both functional and non-functional requirements are provided and are clear. |                                                              |
| **Model description**                          | The model of an API is not provided at all.                  | The model is incomplete or has logical flaws.                | The model is complete and clear.                             |                                                              |
| **Operations description**                     | The operations do not have any documentation at all.         |                                                              | The description is incomplete; for example, the status code is missing or there are no headers. | All operation descriptions are complete.                     |
| **Meaningful status codes**                    | The status codes are either not defined at all, or the system always returns only one status code. |                                                              | Most of the status codes are fine; however, from time to time, incorrect status code is used (for example, 400 for an authentication error). | All the status codes are meaningful and are mapped to their description. |
| **Richardson model application**               | The design has 0 level according to the Richardson model.    |                                                              | The methods are mapped not only to a URI but to HTTP methods as well. | HATEOAS is used.                                             |
| **Authentication**                             | No authentication is described.                              |                                                              | Authentication errors are described, but the method is not described. | Errors are described, the authentication method is described (for example, the JWT structure is provided). |
| **Pagination**                                 | No pagination is described.                                  |                                                              | Some endpoints, which potentially may return large responses, are not paginated. | All relevant methods are paginated.                          |
| **Caching**                                    | No caching is used.                                          |                                                              | Caching is described, but incorrectly (i.e., some operations are not cached when they should be, and vice-versa). | Caching is described and is correct (all required methods are cached, the notes on why some methods are not cached are provided). |

After you are ready with your solution, add the mentor to your repository as a collaborator and paste a link to the repository to the field below. Enter any comments or questions related to your solution if it is necessary. After you submit your solution, please don't edit it.

Rate your solution according to the criteria in the table above on your own.