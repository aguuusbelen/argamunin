/* eslint-disable no-unused-vars */
import { useEffect, useState } from 'react';
import GameService from '../services/GameService';

export default function Index() {
  const [games, setGames] = useState([]);

  async function getGames() {
    const gamesResponse = await GameService.GetGames();
    setGames(gamesResponse);
    console.log(games);
    console.log(gamesResponse);
  }

  async function createGame() {
    const game = {
      name: 'Puzzle Infinite',
      images: ['url1', 'irl2'],
      description: 'description del juego puzzle',
    };
    const response = await GameService.CreateGame(game);
    console.log(response);
  }

  useEffect(() => {
    // getGames();
    // createGame();
  }, []);

  return <div>This is index and hust has more text</div>;
}
