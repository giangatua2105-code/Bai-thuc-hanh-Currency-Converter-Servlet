<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Currency Converter</title>
        <style>
            body { font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; min-height: 100vh; background: linear-gradient(135deg, #667eea, #764ba2); margin: 0; }
            .converter-container { background: white; padding: 40px; border-radius: 12px; box-shadow: 0 20px 40px rgba(0,0,0,0.2); width: 350px; }
            h2 { color: #1b2a7a; text-align: center; margin-bottom: 25px; }
            label { font-weight: bold; color: #333; display: block; margin-top: 10px; }
            input { padding: 12px; margin: 8px 0 15px 0; width: 100%; border: 1px solid #ccc; border-radius: 6px; box-sizing: border-box; font-size: 14px; }
            button { background: #1b2a7a; color: white; padding: 12px; border: none; border-radius: 6px; cursor: pointer; width: 100%; font-weight: bold; font-size: 16px; margin-top: 10px; }
            button:hover { background: #121c54; }
        </style>
    </head>
    <body>
        <div class="converter-container">
            <h2>Chuyen doi USD sang VND</h2>
            <form action="convert" method="POST">
                <label>Ti gia (VND/USD):</label>
                <input type="number" name="rate" placeholder="Vi du: 25000" value="25000" required step="any"/>
                <label>Luong USD can doi:</label>
                <input type="number" name="usd" placeholder="Nhap so USD" required step="any"/>
                <button type="submit">Chuyen doi</button>
            </form>
        </div>
    </body>
</html>