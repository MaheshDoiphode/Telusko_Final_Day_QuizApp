import { TestBed } from '@angular/core/testing';

import { TechStackServiceService } from './tech-stack-service.service';

describe('TechStackServiceService', () => {
  let service: TechStackServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TechStackServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
