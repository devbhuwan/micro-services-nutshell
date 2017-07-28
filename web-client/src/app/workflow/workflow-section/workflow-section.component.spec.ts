import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkflowSectionComponent } from './workflow-section.component';

describe('WorkflowSectionComponent', () => {
  let component: WorkflowSectionComponent;
  let fixture: ComponentFixture<WorkflowSectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WorkflowSectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WorkflowSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
