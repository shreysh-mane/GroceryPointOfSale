import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StaffhomeComponent } from './staffhome.component';

describe('StaffhomeComponent', () => {
  let component: StaffhomeComponent;
  let fixture: ComponentFixture<StaffhomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StaffhomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StaffhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
