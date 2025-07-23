import './App.css';
import { CalculateScore } from '../src/Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name={"THARANI T"} 
        School={"Vimal Jyothi MHSS"} 
        total={291} 
        goal={3} 
      />
    </div>
  );
}

export default App;
