/* eslint-disable no-undef */
class ApiService {
  static getRequestOptions(method, dataBody) {
    return {
      method: 'GET',
      headers: { 'Content-Type': 'application/json' },
      body: dataBody && JSON.stringify(dataBody),
    };
  }

  static async handleRequest(url, requestOptions) {
    const response = await fetch(
      `${process.env.API_HOST}${url}`,
      requestOptions,
    );

    const isJson = response.headers
      .get('content-type')
      ?.includes('application/json');
    const data = isJson && (await response.json());

    // check for error response
    if (!response.ok) {
      // get error message from body or default to response status
      const error = (data && data.message) || response.status;
      return Promise.reject(error);
    }
    return data;
  }

  /*
    const requestOptions = {
      method: 'GET',
      headers: { 'Content-Type': 'application/json' },
    };
    */
  static async get(url) {
    const requestOptions = this.getRequestOptions('GET');
    const response = await this.handleRequest(url, requestOptions);
    return response;
  }

  static async post(url, dataBody) {
    const requestOptions = this.getRequestOptions('POST', dataBody);
    const response = await this.handleRequest(url, requestOptions);
    return response;
  }

  static async put(url, dataBody) {
    const requestOptions = this.getRequestOptions('PUT', dataBody);
    const response = await this.handleRequest(url, requestOptions);
    return response;
  }

  static async delete(url, dataBody) {
    const requestOptions = this.getRequestOptions('DELETE', dataBody);
    const response = await this.handleRequest(url, requestOptions);
    return response;
  }
}

export default ApiService;
