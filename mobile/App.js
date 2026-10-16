/* 
 EVIDENCIA: GA8-220501096-AA2-EV02
 DESARROLLO DE MÓDULOS MÓVILES (APK)
 APRENDIZ: JOHN FREDY VELÁSQUEZ CADAVID
 TECNOLOGÍA: REACT NATIVE / JAVASCRIPT
 DESCRIPCIÓN: Interfaz móvil de Login para la Agencia Misionera MEG.
*/

import React, { useState } from 'react';
import { StyleSheet, Text, View, TextInput, TouchableOpacity, Alert } from 'react-native';

export default function App() {
  const [usuario, setUsuario] = useState('');
  const [contrasena, setContrasena] = useState('');

  const manejarLogin = () => {
    if (usuario === '' || contrasena === '') {
      Alert.alert('Error', 'Por favor complete todos los campos');
    } else {
      // Aquí se conecta con el UsuarioServlet de NetBeans en el Backend
      Alert.alert('Conectando', `Validando usuario en el servidor...`);
    }
  };

  return (
    <View style={styles.contenedor}>
      <Text style={styles.titulo}>MINISTRY EVANGELISTIC GLOBAL</Text>
      <Text style={styles.subtitulo}>CREA TU CUENTA / INGRESO</Text>

      <TextInput 
        style={styles.input} 
        placeholder="Nombre de Usuario" 
        value={usuario}
        onChangeText={setUsuario}
      />

      <TextInput 
        style={styles.input} 
        placeholder="Contraseña" 
        secureTextEntry={true}
        value={contrasena}
        onChangeText={setContrasena}
      />

      <TouchableOpacity style={styles.boton} onPress={manejarLogin}>
        <Text style={styles.textoBoton}>INGRESAR</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  contenedor: { flex: 1, backgroundColor: '#F3F4F6', alignItems: 'center', justifyContent: 'center', padding: 20 },
  titulo: { fontSize: 20, fontWeight: 'bold', color: '#1A365D', marginBottom: 5 },
  subtitulo: { fontSize: 14, color: '#4A5568', marginBottom: 30 },
  input: { width: '100%', height: 50, backgroundColor: '#FFFFFF', borderRadius: 8, paddingHorizontal: 15, marginBottom: 15, borderWidth: 1, borderColor: '#E2E8F0' },
  boton: { width: '100%', height: 50, backgroundColor: '#ED8936', borderRadius: 8, alignItems: 'center', justifyContent: 'center', marginTop: 10 },
  textoBoton: { color: '#FFFFFF', fontSize: 16, fontWeight: 'bold' }
});
