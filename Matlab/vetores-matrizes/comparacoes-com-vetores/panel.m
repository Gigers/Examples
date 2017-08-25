function varargout = panel(varargin)
% PANEL MATLAB code for panel.fig
%      PANEL, by itself, creates a new PANEL or raises the existing
%      singleton*.
%
%      H = PANEL returns the handle to a new PANEL or the handle to
%      the existing singleton*.
%
%      PANEL('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in PANEL.M with the given input arguments.
%
%      PANEL('Property','Value',...) creates a new PANEL or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before panel_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to panel_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help panel

% Last Modified by GUIDE v2.5 14-Aug-2017 13:32:21

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @panel_OpeningFcn, ...
                   'gui_OutputFcn',  @panel_OutputFcn, ...
                   'gui_LayoutFcn',  [] , ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
    gui_State.gui_Callback = str2func(varargin{1});
end

if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end
% End initialization code - DO NOT EDIT


% --- Executes just before panel is made visible.
function panel_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to panel (see VARARGIN)

% Choose default command line output for panel
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes panel wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = panel_OutputFcn(hObject, eventdata, handles) 
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on button press in cbox_equals.
function cbox_equals_Callback(hObject, eventdata, handles)
% hObject    handle to cbox_equals (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hint: get(hObject,'Value') returns toggle state of cbox_equals


% --- Executes on button press in cbox_inters.
function cbox_inters_Callback(hObject, eventdata, handles)
% hObject    handle to cbox_inters (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hint: get(hObject,'Value') returns toggle state of cbox_inters


% --- Executes on button press in btn_verify.
function btn_verify_Callback(hObject, eventdata, handles)
% hObject    handle to btn_verify (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

%-- Definindo vetores temporários para teste da função

vetor1 = [1, 2, 3, 4];
vetor2 = [0, 1, 4, 0];
%vetor2 = [1,0, 3,0];
%vetor2 = [1, 2, 3, 4];
%vetor2 = [5, 6, 7, 8];

%--- Verificando qual botão está precionado para retornar a resposta
if get(handles.cbox_equals, 'value') == 1
   set(handles.cbox_inters, 'value', 0)
   
   if iguais(vetor1, vetor2) == 1
        msgbox('Os vetores verificados são iguais');
    else
        msgbox('Os vetores verificados são diferentes');
   end
end
if get(handles.cbox_inters, 'value') == 1
    set(handles.cbox_equals, 'value', 0);
    
    msgbox('As seguintes colunas tem intersecção');
    msgbox(num2str(inter(vetor1, vetor2)));
    
end


