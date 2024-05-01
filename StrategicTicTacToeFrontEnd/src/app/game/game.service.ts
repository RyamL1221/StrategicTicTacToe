import { Injectable } from "@angular/core";
import { environment } from "../../environment/environment";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Game } from "./game";

@Injectable({providedIn: "root"})
export class GameService {
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient) {}

    public getGames(): Observable<Game[]> {
        return this.http.get<Game[]>(`${this.apiServerUrl}/game/all`);
    }

    public addGame(addGame: Game): Observable<Game> {
        return this.http.post<Game>(`${this.apiServerUrl}/game/add`, addGame);
    }

    public editGame(editGame: Game): Observable<Game> {
        return this.http.put<Game>(`${this.apiServerUrl}/game/edit`, editGame);
    }

    public deleteGame(id: String): Observable<void> {
        return this.http.delete<void>(`${this.apiServerUrl}/game/delete/${id}`)
    }
}