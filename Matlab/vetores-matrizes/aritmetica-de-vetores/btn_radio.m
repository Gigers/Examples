function varargout = btn_radio(varargin)
% BTN_RADIO MATLAB code for btn_radio.fig
%      BTN_RADIO, by itself, creates a new BTN_RADIO or raises the existing
%      singleton*.
%
%      H = BTN_RADIO returns the handle to a new BTN_RADIO or the handle to
%      the existing singleton*.
%
%      BTN_RADIO('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in BTN_RADIO.M with the given input arguments.
%
%      BTN_RADIO('Property','Value',...) creates a new BTN_RADIO or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before btn_radio_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to btn_radio_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help btn_radio

% Last Modified by GUIDE v2.5 10-Aug-2017 14:28:58

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @btn_radio_OpeningFcn, ...
                   'gui_OutputFcn',  @btn_radio_OutputFcn, ...
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


% --- Executes just before btn_radio is made visible.
function btn_radio_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to btn_radio (see VARARGIN)

% Choose default command line output for btn_radio
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes btn_radio wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = btn_radio_OutputFcn(hObject, eventdata, handles)
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on button press in btn_divisao.
function btn_divisao_Callback(hObject, eventdata, handles)
% hObject    handle to btn_divisao (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Hint: get(hObject,'Value') returns toggle state of btn_divisao


% --- Executes on button press in btn_send.
function btn_send_Callback(hObject, eventdata, handles)
% hObject    handle to btn_send (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
if get(handles.btn_adicao, 'value') == 1
  operacao1(1);
end
if get(handles.btn_subtracao, 'value') == 1
    operacao1(2);
end
if get(handles.btn_sub_div, 'value') == 1
    operacao1(3);
end
if get(handles.btn_soma_matriz, 'value') == 1
  operacao1(4);
end
if get(handles.btn_mult_matriz, 'value') == 1
  operacao1(5);
end
if get(handles.btn_div_matriz, 'value') == 1
  operacao1(6);
end
