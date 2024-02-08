import CarouselComponent from '../components/carousel/carousel';
import styles from '../styles/home.module.scss';

const gamesAvailables = [
  {
    id: 1,
    name: 'Crazy Space Ship',
    images: [
      '/img1.PNG',
      '/img2.PNG',
      '/img3.PNG',
      '/img4.PNG',
      '/img5.PNG',
      '/img6.PNG',
    ],
    description: 'Emergencia....',
  },
];
export default function Home() {
  return (
    <div>
      <div className={styles.container}>
        <p className={styles.h1}> ARGAMUNIN </p>
        <div className={styles.linea} />
        <div className={styles.playgame}>
          <div className={styles.containerCarousel}>
            <CarouselComponent images={gamesAvailables[0].images} />
          </div>
          <p className={styles.text}>
            ¡Emergencia espacial! La nave de capitán Toki y su intrépida
            tripulación ha sufrido un desperfecto catastrófico, dejándolos sin
            control.
            <br />
            <br /> Con el destino colgando de un hilo, su única esperanza es
            aprovechar la gravedad de los planetas cercanos para maniobrar y
            regresar a salvo a casa.
            <br />
            <br /> ¡Prepárate para una aventura épica mientras desafiamos las
            leyes del cosmos y luchamos contra el tiempo en esta emocionante
            odisea espacial!
          </p>
          <div>
            <button className={styles.buttonTab}>Jugar</button>
          </div>
        </div>
        <p className={styles.subtitulos}> Nuestros proyectos </p>
        <div className={styles.linea} />
        <p className={styles.subtitulos}> Equipo </p>
        <div className={styles.linea} />
        <div className={styles.team}>algo</div>
      </div>
    </div>
  );
}
