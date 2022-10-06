
import './App.css';



import Zamestnanec from './components/Zamestnanec';

function App() {
  return (
    
      <div className="App" 
      style={{
        display:'flex',
        flexDirection:'column',
        
        alignContent:'stretch',
        flexWrap:'nowrap',
        }}
        >
        
        <div style={{
          
          alignContent:'center',
          alignSelf:'center',
          

        }}>
          
        
          <Zamestnanec/>

        </div>
        
      
      
        
        
      
      
      </div>
   
  );
}

export default App;
