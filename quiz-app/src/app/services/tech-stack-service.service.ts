import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TechStack } from '../models/tech-stack';

@Injectable({
  providedIn: 'root'
})
export class TechStackService {
  private apiUrl = 'your_api_url'; // Replace with your API endpoint for tech stacks

  constructor(private http: HttpClient) {}

  getAllTechStacks(): Observable<TechStack[]> {
    return this.http.get<TechStack[]>(this.apiUrl);
  }
}
