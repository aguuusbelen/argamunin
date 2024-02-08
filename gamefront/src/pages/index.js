import { useEffect, useState } from 'react';
import GameService from '../services/GameService';

export default function Index() {
  const [games, setGames] = useState([]);

  async function getGames() {
    const gamesResponse = await GameService.GetGames();
    setGames(gamesResponse);
    console.log(games);
  }

  useEffect(() => {
    getGames();
  }, []);

  return <div>This is index and hust has more text</div>;
}
