import ApiService from './apiService';

class GameService {
  static async GetGames() {
    const url = '/games';
    const response = await ApiService.get(url);
    return response;
  }
}

export default GameService;
